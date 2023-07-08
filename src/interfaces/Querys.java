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
                       INSERT INTO feria (id_local, nombre, aforo, costo_entrada, fecha, seguridad, presupuesto, is_open)
                       VALUES(?, ?, ?, ?, ?, ?, ?, 1)
                       """;
    String GET_FERIA = "SELECT * FROM feria where id=";
    String GET_FERIA_BY_NAME = "SELECT * FROM feria WHERE nombre=\"";
    String GET_FERIA_OPEN = "SELECT * from feria WHERE is_open=1";
    String GET_ALL_FERIA = "SELECT * FROM feria";
    String CLOSE_FERIA = "UPDATE feria SET is_open=0 WHERE id=";
    
    //gasto
    String GET_MANY_GASTOS = "SELECT * FROM gasto WHERE id_reporte=";
    String ADD_GASTO = "INSERT INTO gasto(id_reporte, detalle, amount) VALUES(?, ?, ?)";

    //ingreso
    String GET_MANY_INGRESOS = "SELECT * FROM ingreso WHERE id_reporte=";
    String ADD_INGRESO = "INSERT INTO ingreso(id_reporte, detalle, amount) VALUES(?, ?, ?)";

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
    
    //reporte
    String ADD_REPORTE = "INSERT INTO reporte (id_feria, id_chart, fecha) VALUES(?, ?, ?);";
    String GET_MANY_REPORTES = "SELECT * FROM reporte WHERE fecha BETWEEN %s AND %s";
    String GET_ALL_REPORTES = "SELECT * FROM reporte";
    String GET_REPORTE = "SELECT * FROM reporte WHERE id=";
    String GET_REPORTE_BY_FERIA = "SELECT * FROM reporte WHERE id_feria=";
    
    //chart
    String ADD_CHART = "INSERT INTO chart(title, x_name, y_name) VALUES(?, ?, ?)";
    String GET_CHART = "SELECT * FROM chart WHERE id=";
    String GET_X_LIST = "SELECT * from data_chart_x where id_chart=";
    String GET_Y_LIST = "SELECT * from data_chart_y where id_chart=";
}
