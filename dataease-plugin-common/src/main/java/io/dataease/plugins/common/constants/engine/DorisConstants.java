package io.dataease.plugins.common.constants.engine;

import io.dataease.plugins.common.constants.SQLConstants;

import static io.dataease.plugins.common.constants.DatasourceTypes.engine_doris;


public class DorisConstants extends SQLConstants {

    public static final String KEYWORD_TABLE = engine_doris.getKeywordPrefix() + "%s" + engine_doris.getKeywordSuffix();

    public static final String KEYWORD_FIX = "%s." + engine_doris.getKeywordPrefix() + "%s" + engine_doris.getKeywordSuffix();

    public static final String ALIAS_FIX = engine_doris.getAliasPrefix() + "%s" + engine_doris.getAliasSuffix();

    public static final String UNIX_TIMESTAMP = "UNIX_TIMESTAMP(%s)";

    public static final String DATE_FORMAT = "DATE_FORMAT(%s,'%s')";

    public static final String FROM_UNIXTIME = "FROM_UNIXTIME(%s,'%s')";

    public static final String STR_TO_DATE = "STR_TO_DATE(%s,'%s')";

    public static final String CAST = "CAST(%s AS %s)";

    public static final String DEFAULT_DATE_FORMAT = "%Y-%m-%d %H:%i:%S";

    public static final String DEFAULT_INT_FORMAT = "BIGINT";

    public static final String DEFAULT_FLOAT_FORMAT = "DECIMAL(20,2)";

    public static final String WHERE_VALUE_NULL = "(NULL,'')";

    public static final String WHERE_VALUE_VALUE = "'%s'";

    public static final String WHERE_NUMBER_VALUE = "%s";

    public static final String AGG_COUNT = "COUNT(*)";

    public static final String AGG_FIELD = "%s(%s)";

    public static final String WHERE_BETWEEN = "'%s' AND '%s'";

    public static final String BRACKETS = "(%s)";

    public static final String ROUND = "ROUND(%s,%s)";

    public static final String VARCHAR = "VARCHAR";

    public static final String NAME = "engine_doris";

    public static final String GROUP_CONCAT = "group_concat(%s)";


}
