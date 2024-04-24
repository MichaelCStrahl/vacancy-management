package br.com.michael.gestaovagas.modules.candidate;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name = "candidate")
public class CandidateEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
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

  @CreationTimestamp
  private LocalDateTime createdAt;
}
