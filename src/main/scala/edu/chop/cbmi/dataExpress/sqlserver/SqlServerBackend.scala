package edu.chop.cbmi.dataExpress.sqlserver

import java.util.Properties

import edu.chop.cbmi.dataExpress.backends.{SqlDialect, SqlBackend}

/**
 * Created by IntelliJ IDEA.
 * User: davidsonl2
 * Date: 6/19/12
 * Time:
 * To change this template use File | Settings | File Templates.
 */


class SqlServerBackend(override val connectionProperties : Properties, _sqlDialect : SqlDialect = null,
                       _driverClassName : String = null)
  extends SqlBackend(connectionProperties, if(_sqlDialect==null)SqlServerSqlDialect else _sqlDialect,
    if(_driverClassName==null)"com.microsoft.sqlserver.jdbc.SQLServerDriver" else _driverClassName) {

}




