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
        setupEpg(_epgMap, et -> ((DbParticipate)et).getUserId(), (et, vl) -> ((DbParticipate)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((DbParticipate)et).getDispOrder(), (et, vl) -> ((DbParticipate)et).setDispOrder(cti(vl)), "dispOrder");
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
        setupEfpg(_efpgMap, et -> ((DbParticipate)et).getScenario(), (et, vl) -> ((DbParticipate)et).setScenario((OptionalEntity<DbScenario>)vl), "scenario");
        setupEfpg(_efpgMap, et -> ((DbParticipate)et).getUser(), (et, vl) -> ((DbParticipate)et).setUser((OptionalEntity<DbUser>)vl), "user");
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
    protected final ColumnInfo _columnParticipateId = cci("participate_id", "participate_id", null, null, Integer.class, "participateId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "participateRoleList", null, false);
    protected final ColumnInfo _columnScenarioId = cci("scenario_id", "scenario_id", null, null, Integer.class, "scenarioId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "scenario", null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnDispOrder = cci("disp_order", "disp_order", null, null, Integer.class, "dispOrder", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
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
     * scenario_id: {UQ+, NotNull, INT UNSIGNED(10), FK to scenario}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScenarioId() { return _columnScenarioId; }
    /**
     * user_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * disp_order: {NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDispOrder() { return _columnDispOrder; }
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
        ls.add(columnUserId());
        ls.add(columnDispOrder());
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

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnScenarioId());
        ls.add(columnUserId());
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
     * SCENARIO by my scenario_id, named 'scenario'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignScenario() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnScenarioId(), DbScenarioDbm.getInstance().columnScenarioId());
        return cfi("fk_participate_scenario", "scenario", this, DbScenarioDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "participateList", false);
    }
    /**
     * USER by my user_id, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), DbUserDbm.getInstance().columnUserId());
        return cfi("fk_participate_user", "user", this, DbUserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "participateList", false);
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
