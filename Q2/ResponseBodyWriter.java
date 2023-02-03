public class ResponseBodyWriter {
    private final Serializer m_serializer;

    public ResponseBodyWriter(Serializer serializer) {

        this.m_serializer = sserializer;
    }

    public void write(Response response, Object object) {

        Context context = new Context(new WriterXmlStrategy());
        context.Execute(response,object,m_serializer);

        context = new Context(new WriterJsonStrategy());
        context.Execute(response,object,m_serializer);

        context = new Context(new WriterStringStrategy());
        context.Execute(response,object,m_serializer);
    }
}


public class Context{
    private WriterStrategy writerStrategy;
    public Context(WriterStrategy writerStrategy){
        this.writerStrategy = writerStrategy;
    }
    public void Execute(Response response, Object object,Serializer serializer){
        writerStrategy.writer(response,object,serializer);
    }
}

public interface WriterStrategy{
    public void writer(Response response, Object object,Serializer serializer);

}

public class WriterXmlStrategy implements WriterStrategy{
    public void writer(Response response, Object object,Serializer serializer){
        if (response.getContentType().equals("application/xml")){
            Response.getWriter().write(serializer.writeXml(object));
        }
    }

}

public class WriterJsonStrategy implements WriterStrategy {
    public void writer(Response response, Object object, Serializer serializer){
        if (response.getContentType().equals("application/json")){
        response.getWriter().write(serializer.writeJson(object));
        }
    }
}

public class WriterStringStrategy implements WriterStrategy {
    public void writer(Response response, Object object, Serializer serializer){
        if (!(response.getContentType().equals("application/json") && response.getContentType().equals("application/xml"))){
            Response.getWriter().write(object.toString());
        }
    }
}