package or.perso.skillconnec.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Parent {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy="parent")
    private List<Booking> bookings;
    @OneToMany(mappedBy="parent")
        private List<Review> reviews;
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
}
