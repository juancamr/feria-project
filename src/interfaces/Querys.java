package interfaces;

public interface Querys {
    //usuario
    String ADD_USER = """
                      INSERT INTO usuario (nombres, dni, telefono, user_name, passwd, correo, tipo_usuario, fecha_registro)
                      VALUES(?, ?, ?, ?, ?, ?, ?, ?)
                      """;
    String GET_USER_BY_USERNAME = "SELECT correo, passwd FROM usuario WHERE user_name=\"";
    
    //feria
    String ADD_FERIA = """
                       INSERT INTO feria (id_local, nombre, aforo, costo_entrada, fecha, seguridad, presupuesto)
                       VALUES(?, ?, ?, ?, ?, ?, ?)
                       """;
    String GET_FERIA_BY_NAME = "SELECT * FROM feria WHERE nombre=\"";
    String GET_ALL_FERIA_NAMES = "SELECT nombre FROM feria";
    
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
    String GET_LOCAL = "SELECT * FROM local WHERE id=";
    String GET_ALL_LOCALS = "SELECT * FROM local";
    String GET_LOCAL_BY_NAME = "SELECT * FROM local where nombre=\"";
    
    //proveedores
    String ADD_PROVIDER = "INSERT INTO proveedor(id_feria, nombre, descripcion, costo_proveedores) VALUES(?, ?, ?, ?)";
}
