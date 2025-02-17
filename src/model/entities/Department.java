package model.entities;
import java.io.Serializable;

public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer Id;
    private String name;

    public Department(){}

    public Department(Integer Id, String name){
        this.Id = Id;     
        this.name = name; 

    }

    public Integer getId(){
        return Id;        
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Department other = (Department) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "department [Id = " + Id + ", name = " + name + "]";
    }
}