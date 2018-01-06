package com.pluralsight.builder;

public class LunchOrderBean {
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    public static Builder builder(){
        return new Builder();
    }


    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public String getBread() {
        return bread;
    }


    private LunchOrderBean(Builder builder){
        this.bread = builder.bread;
        this.meat = builder.meat;
        this.dressing = builder.dressing;
        this.condiments = builder.condiments;
    }



    public static class Builder{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public LunchOrderBean build(){
            return new LunchOrderBean(this);
        }

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat){
            this.meat = meat;
            return this;
        }
    }
}
