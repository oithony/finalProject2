package model;

public class UsuarioModel
{
    public class Usuario {
        private Long id;
        private String nome;
        private String sexo;
        private String celular;
        private String email;

        public Usuario(Long id, String nome, String sexo, String celular, String email) {
            this.id = id;
            this.nome = nome;
            this.sexo = sexo;
            this.celular = celular;
            this.email = email;
        }
    }


}
