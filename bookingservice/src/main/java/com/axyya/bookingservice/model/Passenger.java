package com.axyya.bookingservice.model;


import javax.persistence.*;

@Entity
@Table(name ="passenger_table")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="pass_id")
        Long id;
    @Column(name ="pass_name")
        String name;
    @Column(name ="pass_age")
        String age;
    @Column(name ="pass_gender")
        String gender;
    @Column(name ="pass_source")
        String source;
    @Column(name ="pass_destination")
        String destination;

    @Column(name="pass_identification")
    String identification;

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", identification='" + identification + '\'' +
                '}';
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }



    public Long getId() {
            return id;
        }


        public void setId(Long id) {
            this.id = id;
        }

    //    public Passenger(String name, String age, String gender, String source, String destination) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.source = source;
//        this.destination = destination;
//    }
    public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }


}
