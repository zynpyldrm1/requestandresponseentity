package yte.intern.spring_web.dto;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Value;
import lombok.experimental.PackagePrivate;

import java.time.LocalDate;
@Getter
@Setter
@ToString
public class User {

    @NotBlank(message = "isim boş olamaz")
    private String name;

    @NotBlank
    private String surname;

    @Min(value = 12)
    @Max(value = 100)
    private Long age;

    @NotBlank
    @Email
    private String email;

    @PastOrPresent
    private LocalDate birthDate;

    @Size(max = 250)
    private String address;

    @NotBlank
    private String username;

    @AssertTrue
    public boolean isAdmin(){
        return !username.equals("admin");
    }
}
