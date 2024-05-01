import java.sql.Date;
/**
 * Paciente
 */
public class Paciente {

    private int id;

    private String name;

    private int age;
    
    private String rh;

    private Date lastDate;
    private Date nextDate;

    public Paciente(int id, String name, int age, String rh, Date lastDate, Date nextDate) {
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

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    public Date getNextDate() {
        return nextDate;
    }

    public void setNextDate(Date nextDate) {
        this.nextDate = nextDate;
    }

    public int calculateNextDate(Paciente paciente){
        Date nextDate = (0,0,0);
        if(paciente.getAge() >= 25 && paciente.getAge() <= 35){
            nextDate = 0,0,0;
        }


        return nextDate;
    }
}