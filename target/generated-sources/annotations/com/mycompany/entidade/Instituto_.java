package com.mycompany.entidade;

import com.mycompany.entidade.Professor;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-11-11T10:36:24")
@StaticMetamodel(Instituto.class)
public class Instituto_ { 

    public static volatile SingularAttribute<Instituto, String> sigla;
    public static volatile SingularAttribute<Instituto, String> nome;
    public static volatile SingularAttribute<Instituto, Integer> id;
    public static volatile ListAttribute<Instituto, Professor> professorList;

}