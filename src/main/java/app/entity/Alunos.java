package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ALUNOS
 * @generated
 */
@Entity
@Table(name = "\"ALUNOS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Alunos")
public class Alunos implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "NomeAluno", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeAluno;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_escola", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Escola escola;

  /**
   * Construtor
   * @generated
   */
  public Alunos(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Alunos setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nomeAluno
   * return nomeAluno
   * @generated
   */
  
  public java.lang.String getNomeAluno(){
    return this.nomeAluno;
  }

  /**
   * Define nomeAluno
   * @param nomeAluno nomeAluno
   * @generated
   */
  public Alunos setNomeAluno(java.lang.String nomeAluno){
    this.nomeAluno = nomeAluno;
    return this;
  }

  /**
   * Obtém escola
   * return escola
   * @generated
   */
  
  public Escola getEscola(){
    return this.escola;
  }

  /**
   * Define escola
   * @param escola escola
   * @generated
   */
  public Alunos setEscola(Escola escola){
    this.escola = escola;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Alunos object = (Alunos)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
