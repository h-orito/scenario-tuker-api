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
 * The DB meta of participate_role. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbParticipateRoleDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbParticipateRoleDbm _instance = new DbParticipateRoleDbm();
    private DbParticipateRoleDbm() {}
    public static DbParticipateRoleDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbParticipateRole)et).getParticipateRoleId(), (et, vl) -> ((DbParticipateRole)et).setParticipateRoleId(cti(vl)), "participateRoleId");
        setupEpg(_epgMap, et -> ((DbParticipateRole)et).getParticipateId(), (et, vl) -> ((DbParticipateRole)et).setParticipateId(cti(vl)), "participateId");
        setupEpg(_epgMap, et -> ((DbParticipateRole)et).getParticipateRoleName(), (et, vl) -> ((DbParticipateRole)et).setParticipateRoleName((String)vl), "participateRoleName");
        setupEpg(_epgMap, et -> ((DbParticipateRole)et).getRegisterDatetime(), (et, vl) -> ((DbParticipateRole)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbParticipateRole)et).getRegisterTrace(), (et, vl) -> ((DbParticipateRole)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbParticipateRole)et).getUpdateDatetime(), (et, vl) -> ((DbParticipateRole)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbParticipateRole)et).getUpdateTrace(), (et, vl) -> ((DbParticipateRole)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbParticipateRole)et).getParticipate(), (et, vl) -> ((DbParticipateRole)et).setParticipate((OptionalEntity<DbParticipate>)vl), "participate");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "participate_role";
    protected final String _tableDispName = "PARTICIPATE_ROLE";
    protected final String _tablePropertyName = "participateRole";
    protected final TableSqlName _tableSqlName = new TableSqlName("PARTICIPATE_ROLE", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnParticipateRoleId = cci("participate_role_id", "participate_role_id", null, null, Integer.class, "participateRoleId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParticipateId = cci("participate_id", "participate_id", null, null, Integer.class, "participateId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "participate", null, null, false);
    protected final ColumnInfo _columnParticipateRoleName = cci("participate_role_name", "participate_role_name", null, null, String.class, "participateRoleName", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * participate_role_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateRoleId() { return _columnParticipateRoleId; }
    /**
     * participate_id: {IX, NotNull, INT UNSIGNED(10), FK to participate}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateId() { return _columnParticipateId; }
    /**
     * participate_role_name: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateRoleName() { return _columnParticipateRoleName; }
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
        ls.add(columnParticipateRoleId());
        ls.add(columnParticipateId());
        ls.add(columnParticipateRoleName());
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
    protected UniqueInfo cpui() { return hpcpui(columnParticipateRoleId()); }
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
     * PARTICIPATE by my participate_id, named 'participate'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignParticipate() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParticipateId(), DbParticipateDbm.getInstance().columnParticipateId());
        return cfi("fk_participate_role_participate", "participate", this, DbParticipateDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "participateRoleList", false);
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbParticipateRole"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbParticipateRoleCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbParticipateRoleBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbParticipateRole> getEntityType() { return DbParticipateRole.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbParticipateRole newEntity() { return new DbParticipateRole(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbParticipateRole)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbParticipateRole)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
