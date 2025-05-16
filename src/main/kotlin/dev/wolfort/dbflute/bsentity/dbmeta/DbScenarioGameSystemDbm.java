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
 * The DB meta of scenario_game_system. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbScenarioGameSystemDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbScenarioGameSystemDbm _instance = new DbScenarioGameSystemDbm();
    private DbScenarioGameSystemDbm() {}
    public static DbScenarioGameSystemDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbScenarioGameSystem)et).getScenarioGameSystemId(), (et, vl) -> ((DbScenarioGameSystem)et).setScenarioGameSystemId(cti(vl)), "scenarioGameSystemId");
        setupEpg(_epgMap, et -> ((DbScenarioGameSystem)et).getScenarioId(), (et, vl) -> ((DbScenarioGameSystem)et).setScenarioId(cti(vl)), "scenarioId");
        setupEpg(_epgMap, et -> ((DbScenarioGameSystem)et).getGameSystemId(), (et, vl) -> ((DbScenarioGameSystem)et).setGameSystemId(cti(vl)), "gameSystemId");
        setupEpg(_epgMap, et -> ((DbScenarioGameSystem)et).getRegisterDatetime(), (et, vl) -> ((DbScenarioGameSystem)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbScenarioGameSystem)et).getRegisterTrace(), (et, vl) -> ((DbScenarioGameSystem)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbScenarioGameSystem)et).getUpdateDatetime(), (et, vl) -> ((DbScenarioGameSystem)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbScenarioGameSystem)et).getUpdateTrace(), (et, vl) -> ((DbScenarioGameSystem)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbScenarioGameSystem)et).getGameSystem(), (et, vl) -> ((DbScenarioGameSystem)et).setGameSystem((OptionalEntity<DbGameSystem>)vl), "gameSystem");
        setupEfpg(_efpgMap, et -> ((DbScenarioGameSystem)et).getScenario(), (et, vl) -> ((DbScenarioGameSystem)et).setScenario((OptionalEntity<DbScenario>)vl), "scenario");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "scenario_game_system";
    protected final String _tableDispName = "SCENARIO_GAME_SYSTEM";
    protected final String _tablePropertyName = "scenarioGameSystem";
    protected final TableSqlName _tableSqlName = new TableSqlName("SCENARIO_GAME_SYSTEM", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnScenarioGameSystemId = cci("scenario_game_system_id", "scenario_game_system_id", null, null, Integer.class, "scenarioGameSystemId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScenarioId = cci("scenario_id", "scenario_id", null, null, Integer.class, "scenarioId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "scenario", null, null, false);
    protected final ColumnInfo _columnGameSystemId = cci("game_system_id", "game_system_id", null, null, Integer.class, "gameSystemId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "gameSystem", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * scenario_game_system_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScenarioGameSystemId() { return _columnScenarioGameSystemId; }
    /**
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScenarioId() { return _columnScenarioId; }
    /**
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameSystemId() { return _columnGameSystemId; }
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
        ls.add(columnScenarioGameSystemId());
        ls.add(columnScenarioId());
        ls.add(columnGameSystemId());
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
    protected UniqueInfo cpui() { return hpcpui(columnScenarioGameSystemId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * GAME_SYSTEM by my game_system_id, named 'gameSystem'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignGameSystem() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnGameSystemId(), DbGameSystemDbm.getInstance().columnGameSystemId());
        return cfi("fk_scenario_game_system_game_system", "gameSystem", this, DbGameSystemDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "scenarioGameSystemList", false);
    }
    /**
     * SCENARIO by my scenario_id, named 'scenario'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignScenario() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScenarioId(), DbScenarioDbm.getInstance().columnScenarioId());
        return cfi("fk_scenario_game_system_scenario", "scenario", this, DbScenarioDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "scenarioGameSystemList", false);
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbScenarioGameSystem"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbScenarioGameSystemCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbScenarioGameSystemBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbScenarioGameSystem> getEntityType() { return DbScenarioGameSystem.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbScenarioGameSystem newEntity() { return new DbScenarioGameSystem(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbScenarioGameSystem)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbScenarioGameSystem)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
