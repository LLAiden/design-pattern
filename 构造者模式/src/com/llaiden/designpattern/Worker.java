package com.llaiden.designpattern;

public class Worker {

    private String name;
    private String gender;
    private String age;
    private String salary;

    public Worker() {
        Builder builder = new Builder();
        name = builder.getName();
        gender = builder.getGender();
        age = builder.getAge();
        salary = builder.getSalary();
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    static class Builder {
        private String name = "unkown";
        private String gender = "男";
        private String age = "28";
        private String salary = "100000";

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAge(String age) {
            this.age = age;
            return this;
        }

        public Builder setSalary(String salary) {
            this.salary = salary;
            return this;
        }

        private String getName() {
            return name;
        }

        private String getGender() {
            return gender;
        }

        private String getAge() {
            return age;
        }

        private String getSalary() {
            return salary;
        }

        public Worker build() {
            Worker worker = new Worker();
            worker.name = name;
            worker.gender = gender;
            worker.age = age;
            worker.salary = salary;
            return worker;
        }
    }
}
