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
 * The DB meta of user. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbUserDbm _instance = new DbUserDbm();
    private DbUserDbm() {}
    public static DbUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbUser)et).getUserId(), (et, vl) -> ((DbUser)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((DbUser)et).getUserName(), (et, vl) -> ((DbUser)et).setUserName((String)vl), "userName");
        setupEpg(_epgMap, et -> ((DbUser)et).getUid(), (et, vl) -> ((DbUser)et).setUid((String)vl), "uid");
        setupEpg(_epgMap, et -> ((DbUser)et).getAuthority(), (et, vl) -> ((DbUser)et).setAuthority((String)vl), "authority");
        setupEpg(_epgMap, et -> ((DbUser)et).getIntroduction(), (et, vl) -> ((DbUser)et).setIntroduction((String)vl), "introduction");
        setupEpg(_epgMap, et -> ((DbUser)et).getRegisterDatetime(), (et, vl) -> ((DbUser)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbUser)et).getRegisterTrace(), (et, vl) -> ((DbUser)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbUser)et).getUpdateDatetime(), (et, vl) -> ((DbUser)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbUser)et).getUpdateTrace(), (et, vl) -> ((DbUser)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbUser)et).getTwitterUserAsOne(), (et, vl) -> ((DbUser)et).setTwitterUserAsOne((OptionalEntity<DbTwitterUser>)vl), "twitterUserAsOne");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "user";
    protected final String _tableDispName = "USER";
    protected final String _tablePropertyName = "user";
    protected final TableSqlName _tableSqlName = new TableSqlName("USER", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "participateList", null, false);
    protected final ColumnInfo _columnUserName = cci("user_name", "user_name", null, null, String.class, "userName", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUid = cci("uid", "uid", null, null, String.class, "uid", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAuthority = cci("authority", "authority", null, null, String.class, "authority", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnIntroduction = cci("introduction", "introduction", null, null, String.class, "introduction", null, false, false, false, "TEXT", 65535, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * user_name: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserName() { return _columnUserName; }
    /**
     * uid: {UQ, NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUid() { return _columnUid; }
    /**
     * authority: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAuthority() { return _columnAuthority; }
    /**
     * introduction: {TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnIntroduction() { return _columnIntroduction; }
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
        ls.add(columnUserId());
        ls.add(columnUserName());
        ls.add(columnUid());
        ls.add(columnAuthority());
        ls.add(columnIntroduction());
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
    protected UniqueInfo cpui() { return hpcpui(columnUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnUid()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * twitter_user by user_id, named 'twitterUserAsOne'.
     * @return The information object of foreign property(referrer-as-one). (NotNull)
     */
    public ForeignInfo foreignTwitterUserAsOne() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), DbTwitterUserDbm.getInstance().columnUserId());
        return cfi("fk_twitter_user_user", "twitterUserAsOne", this, DbTwitterUserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, true, false, null, null, false, "user", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * PARTICIPATE by user_id, named 'participateList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerParticipateList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), DbParticipateDbm.getInstance().columnUserId());
        return cri("fk_participate_user", "participateList", this, DbParticipateDbm.getInstance(), mp, false, "user");
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbUser"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbUserCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbUser> getEntityType() { return DbUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbUser newEntity() { return new DbUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
