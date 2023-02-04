import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

class Participant {
    private int ID;
    private String name;
    private int age;
    public Participant(int ID, String name, int age) {
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    @Override
    public String toString() {
        return "Participant{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Participant participant = (Participant) o;

        if (ID != participant.ID) return false;
        if (age != participant.age) return false;
        return Objects.equals(name, participant.name);
    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }

    public static List<Participant> filterUnderage(List<Participant> participants) {
        List<Participant> adults = new ArrayList<>();
        for (Participant participant : participants) {
            if (participant.getAge() >= 18) {
                adults.add(participant);
            }
        }
        return adults;
    }

    public static List<Participant> filterUnderageLinkedList(List<Participant> participants) {
        List<Participant> adults = new LinkedList<>();
        for (Participant participant : participants) {
            if (participant.getAge() >= 18) {
                adults.add(participant);
            }
        }
        return adults;
    }
}

class Main {
    public static void main(String[] args) {
        List<Participant> listOfParticipants = new ArrayList<>();

        listOfParticipants.add(new Participant(1, "Jan", 28));
        listOfParticipants.add(new Participant(2, "Anna", 22));
        listOfParticipants.add(new Participant(3, "Tomasz", 30));
        listOfParticipants.add(new Participant(4, "Karolina", 17));
        listOfParticipants.add(new Participant(5, "Michał", 26));

        for (Participant participant : listOfParticipants) {
            System.out.println(participant);
        }

        List<Participant> adultParticipants = Participant.filterUnderage(listOfParticipants);
        System.out.println("\nAdult Participants:");
        for (Participant participant : adultParticipants) {
            System.out.println(participant);
        }
    }
}