package br.com.achimid.lanchonete.api.mesa;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "mesa")
@EqualsAndHashCode(of = "idMesa", callSuper = false)
public class Mesa {

    @Id
    @GeneratedValue
    private Long idMesa;

    @NotNull(message = "Descrição nao pode ser nulla")
    @NotEmpty(message = "Descrição da mesa nao pode ser vazia")
    private String descricao;

}
