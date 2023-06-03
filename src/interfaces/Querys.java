package interfaces;

public interface Querys {

    String ADD_USER = """
                      INSERT INTO
                          usuario (
                              nombres,
                              dni,
                              telefono,
                              user_name,
                              passwd,
                              correo,
                              tipo_usuario,
                              fecha_registro
                          )
                      VALUES
                          (?, ?, ?, ?, ?, ?, ?, ?)
                      """;
    String IS_USER_EXIST = "SELECT correo, passwd FROM usuario WHERE user_name=\"";
}
