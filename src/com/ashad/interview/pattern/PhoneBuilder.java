package com.ashad.interview.pattern;

public class PhoneBuilder {

    private String osName;
    private int ram;
    private String processor;
    private int screenSize;
    private int battery;

    @Override
    public String toString() {
        return "PhoneBuilder{" +
                "osName='" + osName + '\'' +
                ", ram=" + ram +
                ", processor='" + processor + '\'' +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }

    public PhoneBuilder(Builder builder) {
        this.osName = builder.osName;
        this.ram = builder.ram;
        this.processor = builder.processor;
        this.screenSize = builder.screenSize;
        this.battery = builder.battery;
    }

    public static class Builder {
        private String osName;
        private int ram;
        private String processor;
        private int screenSize;
        private int battery;

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder setScreenSize(int screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Builder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public Builder(String osName) {
            this.osName = osName;
    }

    PhoneBuilder build(){
        return new PhoneBuilder(this);
    }
}

    public static void main(String[] args) {
        System.out.println(new Builder("sd").setRam(512).setBattery(234).setProcessor("icore-5").build());
    }
}
