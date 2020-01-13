package pl.akademiakodu.classes_And_Objects;

import java.time.LocalDate;

public class Question {
    private String userName;
    private String email;
    private LocalDate date;


    public Question (String userName, String email, LocalDate date){
        setUserName(userName);
        setEmail(email);
        setDate(date);

    }
    public void setUserName(String userName){
        if (userName.length()>=3 ){
            this.userName = userName;
        } else {
            System.out.println("wrong data");
        }

    }
    public void setEmail(String email){
        if (email.length()>=3 ){
            this.email = email;
        } else {
            System.out.println("wrong data");
        }


    }
    @Override
    public String toString() {
        return "Question{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public void setDate(LocalDate date){

        this.date = date;

        }


  public boolean isOlderThanTwoWeeks(){
        return date.plusDays(14).isBefore(LocalDate.now());
  }



    public static void main(String[] args) {
        Question question1 = new Question("raven", "jerzyk@wp.pl", LocalDate.of(2019, 7, 7) );
        System.out.println(question1);
        System.out.println(question1.isOlderThanTwoWeeks());
    }
}

