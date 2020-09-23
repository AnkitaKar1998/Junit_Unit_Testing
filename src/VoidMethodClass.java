import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class VoidMethodClass {

    private List personList = new ArrayList<>();

    public void addPerson(String personName) {
        personList.add(personName);
    }

    public void removePerson(String personName) {
        if(!personList.contains(personName)) {
            throw new NoSuchElementException();
        }
        personList.remove(personName);
    }

    public int getPersonListSize() {
        return personList.size();
    }

    public void removeAllPerson() {
        personList.clear();
    }
}
