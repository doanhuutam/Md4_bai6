package Model;

import jdk.jfr.Enabled;

import javax.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String names;

    public Customer() {
    }

    public Customer(long id, String name, String names) {
        this.id = id;
        this.name = name;
        this.names = names;
    }
    @Override
    public String toString(){
        return String.format("Customer[id=%d, name='%s', names='%s']", id, name, names);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }
}


