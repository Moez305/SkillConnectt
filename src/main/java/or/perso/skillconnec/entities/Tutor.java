package or.perso.skillconnec.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
@Entity
public class Tutor {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private double price;
    @ManyToMany
    @JoinTable(name="tutor_subject", joinColumns = @JoinColumn(name="tutor_id"),
            inverseJoinColumns =@JoinColumn(name="subject_id"))
    private List<Subject> subjects;
    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
