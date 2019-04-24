package com.patterns.Builder;

public class SportCar {
    // Required field
    private String title;

    // Optional
    private String company;
    private String distributor;
    private Integer velocity;


    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getDistributor() {
        return distributor;
    }

    public Integer getVelocity() {
        return velocity;
    }

    public void printConfiguration() {
        System.out.println(
                "The configuration of this machine is such : " +
                        "\nTitle - " + getTitle() + "," +
                        "\nCompany - " + (getCompany().isEmpty() ? "no value" : getCompany()) +
                        "\nDistributor - " + (getDistributor().isEmpty() ? "no value" : getDistributor()) +
                        "\nVelocity - " + getVelocity()
        );
    }

//    Bad practice
//
//    SportCar(String title) {
//        this.title = title;
//    }
//
//    SportCar(String title, float velocity) {
//        this.title = title;
//        this.velocity = velocity;
//    }
//
//    SportCar(String title, String company) {
//        this.title = title;
//        this.company = company;
//    }
//
//      SportCar(String title, → → → → → → → → → → ....................................)
//        ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
//        .
//        .
//        .
//        .
//        .
//        .

    private SportCar(Builder builder) {
        title = builder.title;
        velocity = builder.velocity;
        company = builder.company;
        distributor = builder.distributor;
    }

    static class Builder {
        private String title;
        private String company;
        private String distributor;
        private Integer velocity;

        {
            company = "";
            distributor = "";
            velocity = 0;
        }

        public Builder(String title) {
            this.title = title;
        }

        public Builder setCompany(String company) {
            this.company = company;
            return this;
        }

        public Builder setDistributor(String distributor) {
            this.distributor = distributor;
            return this;
        }

        public Builder setVelocity(Integer velocity) {
            this.velocity = velocity;
            return this;
        }

        public SportCar build() {
            return new SportCar(this);
        }
    }
}
