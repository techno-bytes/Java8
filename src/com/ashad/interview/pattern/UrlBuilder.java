package com.ashad.interview.pattern;

public class UrlBuilder {

    private String scheme;
    private String domain;
    private int port;

    public UrlBuilder(Builder builder) {
        this.scheme = builder.scheme;
        this.domain = builder.domain;
        this.port = builder.port;
    }

    static public class Builder{

        private String scheme;
        private String domain;
        private int port;

        public Builder() {
        }

        public Builder setScheme(String scheme) {
            this.scheme = scheme;
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = domain;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public UrlBuilder build(){
            return new UrlBuilder(this);
        }
    }

    @Override
    public String toString() {
        return "UrlBuilder{" +
                "scheme='" + scheme + '\'' +
                ", domain='" + domain + '\'' +
                ", port=" + port +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new Builder().setScheme("https://").setDomain("technobyte.com").setPort(9880).build());
    }
}
