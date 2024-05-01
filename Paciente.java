import java.time.LocalDate;
/**
 * Paciente
 */
public class Paciente {

    private int id;

    private String name;

    private int age;
    
    private String rh;

    private LocalDate lastDate;
    private LocalDate nextDate;

    public Paciente(int id, String name, int age, String rh, LocalDate lastDate, LocalDate nextDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rh = rh;
        this.lastDate = lastDate;
        this.nextDate = nextDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public LocalDate getLastDate() {
        return lastDate;
    }

    public void setLastDate(LocalDate lastDate) {
        this.lastDate = lastDate;
    }

    public LocalDate getNextDate() {
        return nextDate;
    }

    public void setNextDate(LocalDate nextDate) {
        this.nextDate = nextDate;
    }

    public LocalDate calculateNextDate(Paciente paciente){
        LocalDate nextDate;
        if(paciente.getAge() >= 25 && paciente.getAge() <= 35){
            nextDate = getLastDate().plusMonths(2).plusDays(15);
        } else if (paciente.getAge() > 35 && paciente.getAge() <= 45) {
            nextDate = getLastDate().plusMonths(1).plusDays(15);
        }else{
            nextDate = getLastDate().plusDays(15);
        }

        return nextDate;
    }
}