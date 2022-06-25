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
 * The DB meta of user_follow. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbUserFollowDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbUserFollowDbm _instance = new DbUserFollowDbm();
    private DbUserFollowDbm() {}
    public static DbUserFollowDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbUserFollow)et).getUserFollowId(), (et, vl) -> ((DbUserFollow)et).setUserFollowId(cti(vl)), "userFollowId");
        setupEpg(_epgMap, et -> ((DbUserFollow)et).getFromUserId(), (et, vl) -> ((DbUserFollow)et).setFromUserId(cti(vl)), "fromUserId");
        setupEpg(_epgMap, et -> ((DbUserFollow)et).getToUserId(), (et, vl) -> ((DbUserFollow)et).setToUserId(cti(vl)), "toUserId");
        setupEpg(_epgMap, et -> ((DbUserFollow)et).getRegisterDatetime(), (et, vl) -> ((DbUserFollow)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbUserFollow)et).getRegisterTrace(), (et, vl) -> ((DbUserFollow)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbUserFollow)et).getUpdateDatetime(), (et, vl) -> ((DbUserFollow)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbUserFollow)et).getUpdateTrace(), (et, vl) -> ((DbUserFollow)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbUserFollow)et).getUserByFromUserId(), (et, vl) -> ((DbUserFollow)et).setUserByFromUserId((OptionalEntity<DbUser>)vl), "userByFromUserId");
        setupEfpg(_efpgMap, et -> ((DbUserFollow)et).getUserByToUserId(), (et, vl) -> ((DbUserFollow)et).setUserByToUserId((OptionalEntity<DbUser>)vl), "userByToUserId");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "user_follow";
    protected final String _tableDispName = "USER_FOLLOW";
    protected final String _tablePropertyName = "userFollow";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER_FOLLOW", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserFollowId = cci("user_follow_id", "user_follow_id", null, null, Integer.class, "userFollowId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnFromUserId = cci("from_user_id", "from_user_id", null, null, Integer.class, "fromUserId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "userByFromUserId", null, null, false);
    protected final ColumnInfo _columnToUserId = cci("to_user_id", "to_user_id", null, null, Integer.class, "toUserId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "userByToUserId", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * user_follow_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserFollowId() { return _columnUserFollowId; }
    /**
     * from_user_id: {UQ+, NotNull, INT UNSIGNED(10), FK to user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnFromUserId() { return _columnFromUserId; }
    /**
     * to_user_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnToUserId() { return _columnToUserId; }
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
        ls.add(columnUserFollowId());
        ls.add(columnFromUserId());
        ls.add(columnToUserId());
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
    protected UniqueInfo cpui() { return hpcpui(columnUserFollowId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnFromUserId());
        ls.add(columnToUserId());
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
     * USER by my from_user_id, named 'userByFromUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByFromUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnFromUserId(), DbUserDbm.getInstance().columnUserId());
        return cfi("fk_user_follow_from_user", "userByFromUserId", this, DbUserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userFollowByFromUserIdList", false);
    }
    /**
     * USER by my to_user_id, named 'userByToUserId'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUserByToUserId() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnToUserId(), DbUserDbm.getInstance().columnUserId());
        return cfi("fk_user_follow_to_user", "userByToUserId", this, DbUserDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "userFollowByToUserIdList", false);
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbUserFollow"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbUserFollowCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbUserFollowBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbUserFollow> getEntityType() { return DbUserFollow.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbUserFollow newEntity() { return new DbUserFollow(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbUserFollow)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbUserFollow)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
