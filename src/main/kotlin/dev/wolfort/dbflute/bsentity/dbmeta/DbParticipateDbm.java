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
 * The DB meta of participate. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbParticipateDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbParticipateDbm _instance = new DbParticipateDbm();
    private DbParticipateDbm() {}
    public static DbParticipateDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbParticipate)et).getParticipateId(), (et, vl) -> ((DbParticipate)et).setParticipateId(cti(vl)), "participateId");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getScenarioId(), (et, vl) -> ((DbParticipate)et).setScenarioId(cti(vl)), "scenarioId");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getGameSystemId(), (et, vl) -> ((DbParticipate)et).setGameSystemId(cti(vl)), "gameSystemId");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getUserId(), (et, vl) -> ((DbParticipate)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getDispOrder(), (et, vl) -> ((DbParticipate)et).setDispOrder(cti(vl)), "dispOrder");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getParticipateTermFrom(), (et, vl) -> ((DbParticipate)et).setParticipateTermFrom(ctld(vl)), "participateTermFrom");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getParticipateTermTo(), (et, vl) -> ((DbParticipate)et).setParticipateTermTo(ctld(vl)), "participateTermTo");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getPlayerNum(), (et, vl) -> ((DbParticipate)et).setPlayerNum(cti(vl)), "playerNum");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getGameMaster(), (et, vl) -> ((DbParticipate)et).setGameMaster((String)vl), "gameMaster");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getPlayerNames(), (et, vl) -> ((DbParticipate)et).setPlayerNames((String)vl), "playerNames");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getRequiredHours(), (et, vl) -> ((DbParticipate)et).setRequiredHours(cti(vl)), "requiredHours");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getMemo(), (et, vl) -> ((DbParticipate)et).setMemo((String)vl), "memo");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getRegisterDatetime(), (et, vl) -> ((DbParticipate)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getRegisterTrace(), (et, vl) -> ((DbParticipate)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getUpdateDatetime(), (et, vl) -> ((DbParticipate)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getUpdateTrace(), (et, vl) -> ((DbParticipate)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbParticipate)et).getGameSystem(), (et, vl) -> ((DbParticipate)et).setGameSystem((OptionalEntity<DbGameSystem>)vl), "gameSystem");
        setupEfpg(_efpgMap, et -> ((DbParticipate)et).getScenario(), (et, vl) -> ((DbParticipate)et).setScenario((OptionalEntity<DbScenario>)vl), "scenario");
        setupEfpg(_efpgMap, et -> ((DbParticipate)et).getUser(), (et, vl) -> ((DbParticipate)et).setUser((OptionalEntity<DbUser>)vl), "user");
        setupEfpg(_efpgMap, et -> ((DbParticipate)et).getParticipateImpressionAsOne(), (et, vl) -> ((DbParticipate)et).setParticipateImpressionAsOne((OptionalEntity<DbParticipateImpression>)vl), "participateImpressionAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "participate";
    protected final String _tableDispName = "PARTICIPATE";
    protected final String _tablePropertyName = "participate";
    protected final TableSqlName _tableSqlName = new TableSqlName("PARTICIPATE", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnParticipateId = cci("participate_id", "participate_id", null, null, Integer.class, "participateId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "participateRoleList,participateRuleBookList", null, false);
    protected final ColumnInfo _columnScenarioId = cci("scenario_id", "scenario_id", null, null, Integer.class, "scenarioId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "scenario", null, null, false);
    protected final ColumnInfo _columnGameSystemId = cci("game_system_id", "game_system_id", null, null, Integer.class, "gameSystemId", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, "gameSystem", null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnDispOrder = cci("disp_order", "disp_order", null, null, Integer.class, "dispOrder", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParticipateTermFrom = cci("participate_term_from", "participate_term_from", null, null, java.time.LocalDate.class, "participateTermFrom", null, false, false, false, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParticipateTermTo = cci("participate_term_to", "participate_term_to", null, null, java.time.LocalDate.class, "participateTermTo", null, false, false, false, "DATE", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlayerNum = cci("player_num", "player_num", null, null, Integer.class, "playerNum", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnGameMaster = cci("game_master", "game_master", null, null, String.class, "gameMaster", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnPlayerNames = cci("player_names", "player_names", null, null, String.class, "playerNames", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRequiredHours = cci("required_hours", "required_hours", null, null, Integer.class, "requiredHours", null, false, false, false, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnMemo = cci("memo", "memo", null, null, String.class, "memo", null, false, false, false, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * participate_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateId() { return _columnParticipateId; }
    /**
     * scenario_id: {IX, NotNull, INT UNSIGNED(10), FK to scenario}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScenarioId() { return _columnScenarioId; }
    /**
     * game_system_id: {IX, INT UNSIGNED(10), FK to game_system}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameSystemId() { return _columnGameSystemId; }
    /**
     * user_id: {IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDispOrder() { return _columnDispOrder; }
    /**
     * participate_term_from: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateTermFrom() { return _columnParticipateTermFrom; }
    /**
     * participate_term_to: {DATE(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateTermTo() { return _columnParticipateTermTo; }
    /**
     * player_num: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlayerNum() { return _columnPlayerNum; }
    /**
     * game_master: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameMaster() { return _columnGameMaster; }
    /**
     * player_names: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnPlayerNames() { return _columnPlayerNames; }
    /**
     * required_hours: {INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRequiredHours() { return _columnRequiredHours; }
    /**
     * memo: {VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnMemo() { return _columnMemo; }
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
        ls.add(columnParticipateId());
        ls.add(columnScenarioId());
        ls.add(columnGameSystemId());
        ls.add(columnUserId());
        ls.add(columnDispOrder());
        ls.add(columnParticipateTermFrom());
        ls.add(columnParticipateTermTo());
        ls.add(columnPlayerNum());
        ls.add(columnGameMaster());
        ls.add(columnPlayerNames());
        ls.add(columnRequiredHours());
        ls.add(columnMemo());
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
    protected UniqueInfo cpui() { return hpcpui(columnParticipateId()); }
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
        return cfi("fk_participate_game_system", "gameSystem", this, DbGameSystemDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "participateList", false);
    }
    /**
     * SCENARIO by my scenario_id, named 'scenario'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignScenario() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScenarioId(), DbScenarioDbm.getInstance().columnScenarioId());
        return cfi("fk_participate_scenario", "scenario", this, DbScenarioDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "participateList", false);
    }
    /**
     * USER by my user_id, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), DbUserDbm.getInstance().columnUserId());
        return cfi("fk_participate_user", "user", this, DbUserDbm.getInstance(), mp, 2, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "participateList", false);
    }
    /**
     * participate_impression by participate_id, named 'participateImpressionAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignParticipateImpressionAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParticipateId(), DbParticipateImpressionDbm.getInstance().columnParticipateId());
        return cfi("fk_participate_impression_participate", "participateImpressionAsOne", this, DbParticipateImpressionDbm.getInstance(), mp, 3, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "participate", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * PARTICIPATE_ROLE by participate_id, named 'participateRoleList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerParticipateRoleList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParticipateId(), DbParticipateRoleDbm.getInstance().columnParticipateId());
        return cri("fk_participate_role_participate", "participateRoleList", this, DbParticipateRoleDbm.getInstance(), mp, false, "participate");
    }
    /**
     * PARTICIPATE_RULE_BOOK by participate_id, named 'participateRuleBookList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerParticipateRuleBookList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParticipateId(), DbParticipateRuleBookDbm.getInstance().columnParticipateId());
        return cri("fk_participate_rule_book_participate", "participateRuleBookList", this, DbParticipateRuleBookDbm.getInstance(), mp, false, "participate");
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbParticipate"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbParticipateCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbParticipateBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbParticipate> getEntityType() { return DbParticipate.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbParticipate newEntity() { return new DbParticipate(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbParticipate)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbParticipate)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
