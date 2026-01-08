package org.example.simspring.beans;

public class Sim {


        private String name;
        private String number;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

    @Override
    public String toString() {
        return "Sim{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public void Calling (){
            System.out.println("Calling via : "+name+" Through number : "+number);
        }
    }


