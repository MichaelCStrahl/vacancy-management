package br.com.michael.gestaovagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {
  private UUID id;
  private String name;
  @NotBlank
  @Pattern(regexp = "\\S+", message = "O campo [userName] não deve conter espaços")
  private String userName;
  @Email(message = "O campo [email] deve conter um e-mail válido")
  private String email;
  @Length(min = 6, max = 20, message = "O campo [password] deve conter etre 6 e 20 caracteres")
  private String password;
  private String description;
  private String curriculum;
}
