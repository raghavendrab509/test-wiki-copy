package com.forrent.beans.propertyListing;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SiteText implements Serializable
{
    private String id;

    private Text text;

    private class Text
    {
        private String en;
        private String es;

        public String getEn()
        {
            return en;
        }

        public void setEn(String en)
        {
            this.en = en;
        }

        public String getEs()
        {
            return es;
        }

        public void setEs(String es)
        {
            this.es = es;
        }
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Text getText()
    {
        return text;
    }

    public void setText(Text text)
    {
        this.text = text;
    }
}
