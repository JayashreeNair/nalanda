package com.freezone.nalanda.domain;

import lombok.Getter;

@Getter
public class Guru extends User {
    private Subject classes[];

    public void teaches(Subject classes[]) {
        this.classes = classes;
    }

    public static class GuruBuilder {
        private Guru instance;

        public GuruBuilder() {
            this.instance = new Guru();
        }

        public GuruBuilder FirstName(String fName){
            this.instance.setFName(fName);
            return this;
        }

        public GuruBuilder MiddleName(String mName){
            this.instance.setMName(mName);
            return this;
        }

        public GuruBuilder LastName(String lName){
            this.instance.setLName(lName);
            return this;
        }

        public Guru build(){
            return instance;
        }
    }
}
