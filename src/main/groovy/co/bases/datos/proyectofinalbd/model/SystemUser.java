package co.bases.datos.proyectofinalbd.model;



import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SystemUser {

    private String id;
    private  String username;
    private String password;
    private String fullName;
    private Role role;

}
