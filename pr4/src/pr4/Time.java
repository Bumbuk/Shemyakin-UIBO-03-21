package pr4;

public enum Time {

    SUMMER("лето",30),AUTUMN("осень",10),WINTER("зиму",-30),SPRING("весну",20);
    String time_of_year;
    int temp;
    Time(String time_of_year, int temp) {
        this.time_of_year = time_of_year;
        this.temp = temp;
    }

    public String getTime_of_year() {
        return time_of_year;
    }

    public void setTime_of_year(String time_of_year) {
        this.time_of_year = time_of_year;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getDescription(){
        if(temp<19){
            return "холодное вермя года ";
        }
        else{
            return "тёплое время года ";
        }
    }

    @Override
    public String toString() {
        return "Я люблю " + time_of_year + ". В это "+ getDescription() + temp +" градусов";
    }
}
