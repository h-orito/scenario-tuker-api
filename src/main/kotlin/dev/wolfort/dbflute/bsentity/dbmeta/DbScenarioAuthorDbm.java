package dev.wolfort.dbflute.bsentity.dbmeta;

import java.util.List;
import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.dbmeta.AbstractDBMeta;
import org.dbflute.dbmeta.info.*;
import org.dbflute.dbmeta.name.*;
import org.dbflute.dbmeta.property.PropertyGateway;
import org.dbflute.dbway.DBDef;
import dev.wolfort.dbflute.allcommon.*;
import dev.wolfort.dbflute.exentity.*;

/**
 * The DB meta of scenario_author. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbScenarioAuthorDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbScenarioAuthorDbm _instance = new DbScenarioAuthorDbm();
    private DbScenarioAuthorDbm() {}
    public static DbScenarioAuthorDbm getInstance() { return _instance; }

    // ===================================================================================
    //                                                                       Current DBDef
    //                                                                       =============
    public String getProjectName() { return DbDBCurrent.getInstance().projectName(); }
    public String getProjectPrefix() { return DbDBCurrent.getInstance().projectPrefix(); }
    public String getGenerationGapBasePrefix() { return DbDBCurrent.getInstance().generationGapBasePrefix(); }
    public DBDef getCurrentDBDef() { return DbDBCurrent.getInstance().currentDBDef(); }

    // ===================================================================================
    //                                                                    Property Gateway
    //                                                                    ================
    // -----------------------------------------------------
    //                                       Column Property
    //                                       ---------------
    protected final Map<String, PropertyGateway> _epgMap = newHashMap();
    { xsetupEpg(); }
    protected void xsetupEpg() {
        setupEpg(_epgMap, et -> ((DbScenarioAuthor)et).getScenarioAuthorId(), (et, vl) -> ((DbScenarioAuthor)et).setScenarioAuthorId(cti(vl)), "scenarioAuthorId");
        setupEpg(_epgMap, et -> ((DbScenarioAuthor)et).getScenarioId(), (et, vl) -> ((DbScenarioAuthor)et).setScenarioId(cti(vl)), "scenarioId");
        setupEpg(_epgMap, et -> ((DbScenarioAuthor)et).getAuthorId(), (et, vl) -> ((DbScenarioAuthor)et).setAuthorId(cti(vl)), "authorId");
        setupEpg(_epgMap, et -> ((DbScenarioAuthor)et).getRegisterDatetime(), (et, vl) -> ((DbScenarioAuthor)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbScenarioAuthor)et).getRegisterTrace(), (et, vl) -> ((DbScenarioAuthor)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbScenarioAuthor)et).getUpdateDatetime(), (et, vl) -> ((DbScenarioAuthor)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbScenarioAuthor)et).getUpdateTrace(), (et, vl) -> ((DbScenarioAuthor)et).setUpdateTrace((String)vl), "updateTrace");
    }
    public PropertyGateway findPropertyGateway(String prop)
    { return doFindEpg(_epgMap, prop); }

    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    protected final Map<String, PropertyGateway> _efpgMap = newHashMap();
    { xsetupEfpg(); }
    @SuppressWarnings("unchecked")
    protected void xsetupEfpg() {
        setupEfpg(_efpgMap, et -> ((DbScenarioAuthor)et).getAuthor(), (et, vl) -> ((DbScenarioAuthor)et).setAuthor((OptionalEntity<DbAuthor>)vl), "author");
        setupEfpg(_efpgMap, et -> ((DbScenarioAuthor)et).getScenario(), (et, vl) -> ((DbScenarioAuthor)et).setScenario((OptionalEntity<DbScenario>)vl), "scenario");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "scenario_author";
    protected final String _tableDispName = "SCENARIO_AUTHOR";
    protected final String _tablePropertyName = "scenarioAuthor";
    protected final TableSqlName _tableSqlName = new TableSqlName("SCENARIO_AUTHOR", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnScenarioAuthorId = cci("scenario_author_id", "scenario_author_id", null, null, Integer.class, "scenarioAuthorId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScenarioId = cci("scenario_id", "scenario_id", null, null, Integer.class, "scenarioId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "scenario", null, null, false);
    protected final ColumnInfo _columnAuthorId = cci("author_id", "author_id", null, null, Integer.class, "authorId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "author", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * scenario_author_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScenarioAuthorId() { return _columnScenarioAuthorId; }
    /**
     * scenario_id: {UQ+, NotNull, INT UNSIGNED(10), FK to scenario}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScenarioId() { return _columnScenarioId; }
    /**
     * author_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to author}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuthorId() { return _columnAuthorId; }
    /**
     * register_datetime: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterDatetime() { return _columnRegisterDatetime; }
    /**
     * register_trace: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRegisterTrace() { return _columnRegisterTrace; }
    /**
     * update_datetime: {NotNull, DATETIME(19)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateDatetime() { return _columnUpdateDatetime; }
    /**
     * update_trace: {NotNull, VARCHAR(64)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUpdateTrace() { return _columnUpdateTrace; }

    protected List<ColumnInfo> ccil() {
        List<ColumnInfo> ls = newArrayList();
        ls.add(columnScenarioAuthorId());
        ls.add(columnScenarioId());
        ls.add(columnAuthorId());
        ls.add(columnRegisterDatetime());
        ls.add(columnRegisterTrace());
        ls.add(columnUpdateDatetime());
        ls.add(columnUpdateTrace());
        return ls;
    }

    { initializeInformationResource(); }

    // ===================================================================================
    //                                                                         Unique Info
    //                                                                         ===========
    // -----------------------------------------------------
    //                                       Primary Element
    //                                       ---------------
    protected UniqueInfo cpui() { return hpcpui(columnScenarioAuthorId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnScenarioId());
        ls.add(columnAuthorId());
        return hpcui(ls);
    }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * AUTHOR by my author_id, named 'author'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignAuthor() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnAuthorId(), DbAuthorDbm.getInstance().columnAuthorId());
        return cfi("fk_scenario_author_author", "author", this, DbAuthorDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "scenarioAuthorList", false);
    }
    /**
     * SCENARIO by my scenario_id, named 'scenario'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignScenario() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScenarioId(), DbScenarioDbm.getInstance().columnScenarioId());
        return cfi("fk_scenario_author_scenario", "scenario", this, DbScenarioDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "scenarioAuthorList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------

    // ===================================================================================
    //                                                                        Various Info
    //                                                                        ============
    public boolean hasIdentity() { return true; }
    public boolean hasCommonColumn() { return true; }
    public List<ColumnInfo> getCommonColumnInfoList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterTrace(), columnUpdateDatetime(), columnUpdateTrace()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeInsertList()
    { return newArrayList(columnRegisterDatetime(), columnRegisterTrace(), columnUpdateDatetime(), columnUpdateTrace()); }
    public List<ColumnInfo> getCommonColumnInfoBeforeUpdateList()
    { return newArrayList(columnUpdateDatetime(), columnUpdateTrace()); }

    // ===================================================================================
    //                                                                           Type Name
    //                                                                           =========
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbScenarioAuthor"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbScenarioAuthorCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbScenarioAuthorBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbScenarioAuthor> getEntityType() { return DbScenarioAuthor.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbScenarioAuthor newEntity() { return new DbScenarioAuthor(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbScenarioAuthor)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbScenarioAuthor)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
