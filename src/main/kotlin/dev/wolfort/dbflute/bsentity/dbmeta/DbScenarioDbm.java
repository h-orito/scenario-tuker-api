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
 * The DB meta of scenario. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbScenarioDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbScenarioDbm _instance = new DbScenarioDbm();
    private DbScenarioDbm() {}
    public static DbScenarioDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbScenario)et).getScenarioId(), (et, vl) -> ((DbScenario)et).setScenarioId(cti(vl)), "scenarioId");
        setupEpg(_epgMap, et -> ((DbScenario)et).getScenarioName(), (et, vl) -> ((DbScenario)et).setScenarioName((String)vl), "scenarioName");
        setupEpg(_epgMap, et -> ((DbScenario)et).getScenarioType(), (et, vl) -> ((DbScenario)et).setScenarioType((String)vl), "scenarioType");
        setupEpg(_epgMap, et -> ((DbScenario)et).getScenarioUrl(), (et, vl) -> ((DbScenario)et).setScenarioUrl((String)vl), "scenarioUrl");
        setupEpg(_epgMap, et -> ((DbScenario)et).getGameSystemId(), (et, vl) -> ((DbScenario)et).setGameSystemId(cti(vl)), "gameSystemId");
        setupEpg(_epgMap, et -> ((DbScenario)et).getGameMasterRequirement(), (et, vl) -> ((DbScenario)et).setGameMasterRequirement((String)vl), "gameMasterRequirement");
        setupEpg(_epgMap, et -> ((DbScenario)et).getPlayerNumMin(), (et, vl) -> ((DbScenario)et).setPlayerNumMin(cti(vl)), "playerNumMin");
        setupEpg(_epgMap, et -> ((DbScenario)et).getPlayerNumMax(), (et, vl) -> ((DbScenario)et).setPlayerNumMax(cti(vl)), "playerNumMax");
        setupEpg(_epgMap, et -> ((DbScenario)et).getRequiredHours(), (et, vl) -> ((DbScenario)et).setRequiredHours(cti(vl)), "requiredHours");
        setupEpg(_epgMap, et -> ((DbScenario)et).getRegisterDatetime(), (et, vl) -> ((DbScenario)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbScenario)et).getRegisterTrace(), (et, vl) -> ((DbScenario)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbScenario)et).getUpdateDatetime(), (et, vl) -> ((DbScenario)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbScenario)et).getUpdateTrace(), (et, vl) -> ((DbScenario)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbScenario)et).getGameSystem(), (et, vl) -> ((DbScenario)et).setGameSystem((OptionalEntity<DbGameSystem>)vl), "gameSystem");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "scenario";
    protected final String _tableDispName = "SCENARIO";
    protected final String _tablePropertyName = "scenario";
    protected final TableSqlName _tableSqlName = new TableSqlName("SCENARIO", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnScenarioId = cci("scenario_id", "scenario_id", null, null, Integer.class, "scenarioId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "participateList,scenarioAuthorList,scenarioDictionaryList,userScenarioList", null, false);
    protected final ColumnInfo _columnScenarioName = cci("scenario_name", "scenario_name", null, null, String.class, "scenarioName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScenarioType = cci("scenario_type", "scenario_type", null, null, String.class, "scenarioType", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScenarioUrl = cci("scenario_url", "scenario_url", null, null, String.class, "scenarioUrl", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGameSystemId = cci("game_system_id", "game_system_id", null, null, Integer.class, "gameSystemId", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, "gameSystem", null, null, false);
    protected final ColumnInfo _columnGameMasterRequirement = cci("game_master_requirement", "game_master_requirement", null, null, String.class, "gameMasterRequirement", null, false, false, false, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlayerNumMin = cci("player_num_min", "player_num_min", null, null, Integer.class, "playerNumMin", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlayerNumMax = cci("player_num_max", "player_num_max", null, null, Integer.class, "playerNumMax", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRequiredHours = cci("required_hours", "required_hours", null, null, Integer.class, "requiredHours", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * scenario_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScenarioId() { return _columnScenarioId; }
    /**
     * scenario_name: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScenarioName() { return _columnScenarioName; }
    /**
     * scenario_type: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScenarioType() { return _columnScenarioType; }
    /**
     * scenario_url: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScenarioUrl() { return _columnScenarioUrl; }
    /**
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameSystemId() { return _columnGameSystemId; }
    /**
     * game_master_requirement: {VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameMasterRequirement() { return _columnGameMasterRequirement; }
    /**
     * player_num_min: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlayerNumMin() { return _columnPlayerNumMin; }
    /**
     * player_num_max: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlayerNumMax() { return _columnPlayerNumMax; }
    /**
     * required_hours: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRequiredHours() { return _columnRequiredHours; }
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
        ls.add(columnScenarioId());
        ls.add(columnScenarioName());
        ls.add(columnScenarioType());
        ls.add(columnScenarioUrl());
        ls.add(columnGameSystemId());
        ls.add(columnGameMasterRequirement());
        ls.add(columnPlayerNumMin());
        ls.add(columnPlayerNumMax());
        ls.add(columnRequiredHours());
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
    protected UniqueInfo cpui() { return hpcpui(columnScenarioId()); }
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
        return cfi("fk_scenario_game_system", "gameSystem", this, DbGameSystemDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "scenarioList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * PARTICIPATE by scenario_id, named 'participateList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerParticipateList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScenarioId(), DbParticipateDbm.getInstance().columnScenarioId());
        return cri("fk_participate_scenario", "participateList", this, DbParticipateDbm.getInstance(), mp, false, "scenario");
    }
    /**
     * SCENARIO_AUTHOR by scenario_id, named 'scenarioAuthorList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerScenarioAuthorList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScenarioId(), DbScenarioAuthorDbm.getInstance().columnScenarioId());
        return cri("fk_scenario_author_scenario", "scenarioAuthorList", this, DbScenarioAuthorDbm.getInstance(), mp, false, "scenario");
    }
    /**
     * SCENARIO_DICTIONARY by scenario_id, named 'scenarioDictionaryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerScenarioDictionaryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScenarioId(), DbScenarioDictionaryDbm.getInstance().columnScenarioId());
        return cri("fk_scenario_dictionary_scenario", "scenarioDictionaryList", this, DbScenarioDictionaryDbm.getInstance(), mp, false, "scenario");
    }
    /**
     * USER_SCENARIO by scenario_id, named 'userScenarioList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserScenarioList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScenarioId(), DbUserScenarioDbm.getInstance().columnScenarioId());
        return cri("fk_user_scenario_scenario", "userScenarioList", this, DbUserScenarioDbm.getInstance(), mp, false, "scenario");
    }

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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbScenario"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbScenarioCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbScenarioBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbScenario> getEntityType() { return DbScenario.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbScenario newEntity() { return new DbScenario(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbScenario)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbScenario)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
