package interfaces;

public interface Querys {
    //usuario
    String ADD_USER = """
                      INSERT INTO usuario (nombres, dni, telefono, user_name, passwd, correo, tipo_usuario, fecha_registro)
                      VALUES(?, ?, ?, ?, ?, ?, ?, ?)
                      """;
    String GET_BY_USERNAME = "SELECT correo, passwd FROM usuario WHERE user_name=\"";
    
    //feria
    String ADD_FERIA = "Insert into ferias (nom_fer, afor_fer, cost_fer, fech_fer, seg_fer,presu_fer) values (?,?,?,?,?,?)";
    
    //gasto
    String GET_MANY_GASTOS = "SELECT id, cant_gast, reporte_id FROM gasto WHERE reporte_id=";

    //ingreso
    String GET_MANY_INGRESOS = "SELECT id, cantidad_in, reporte_id FROM ingreso WHERE reporte_id=";
    
    //reporte
    String GET_REPORTE = "SELECT nombre_reporte, column_3, stand_id FROM reporte WHERE id=";

    //local
    String ADD_LOCAL = """
                       INSERT INTO local (nombre, distrito, aforo, costo, fecha)
                        VALUES(?, ?, ?, ?, ?)
              """;
}
