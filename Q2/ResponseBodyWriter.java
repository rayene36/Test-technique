public class ResponseBodyWriter {
    private final Serializer m_srlz;

    public ResponseBodyWriter(Serializer s) {
        this.m_srlz = s;
    }

    public void write(Response r, Object c) {
        if (r.getContentType().equals("application/xml"))
        {
            r.getWriter().write(m_srlz.writeXml(c));
        } else if (    r.getContentType().equals("application/json")) {
            r.getWriter().write(this.m_srlz.writeJson(c));
        } else{
            r.getWriter().write(c.toString());
        }

        return;
    }
}
