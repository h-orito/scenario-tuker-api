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
 * The DB meta of twitter_user. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbTwitterUserDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbTwitterUserDbm _instance = new DbTwitterUserDbm();
    private DbTwitterUserDbm() {}
    public static DbTwitterUserDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbTwitterUser)et).getTwitterUserId(), (et, vl) -> ((DbTwitterUser)et).setTwitterUserId(cti(vl)), "twitterUserId");
        setupEpg(_epgMap, et -> ((DbTwitterUser)et).getUserId(), (et, vl) -> ((DbTwitterUser)et).setUserId(cti(vl)), "userId");
        setupEpg(_epgMap, et -> ((DbTwitterUser)et).getTwitterId(), (et, vl) -> ((DbTwitterUser)et).setTwitterId((String)vl), "twitterId");
        setupEpg(_epgMap, et -> ((DbTwitterUser)et).getScreenName(), (et, vl) -> ((DbTwitterUser)et).setScreenName((String)vl), "screenName");
        setupEpg(_epgMap, et -> ((DbTwitterUser)et).getAccessToken(), (et, vl) -> ((DbTwitterUser)et).setAccessToken((String)vl), "accessToken");
        setupEpg(_epgMap, et -> ((DbTwitterUser)et).getTokenSecret(), (et, vl) -> ((DbTwitterUser)et).setTokenSecret((String)vl), "tokenSecret");
        setupEpg(_epgMap, et -> ((DbTwitterUser)et).getRegisterDatetime(), (et, vl) -> ((DbTwitterUser)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbTwitterUser)et).getRegisterTrace(), (et, vl) -> ((DbTwitterUser)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbTwitterUser)et).getUpdateDatetime(), (et, vl) -> ((DbTwitterUser)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbTwitterUser)et).getUpdateTrace(), (et, vl) -> ((DbTwitterUser)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbTwitterUser)et).getUser(), (et, vl) -> ((DbTwitterUser)et).setUser((OptionalEntity<DbUser>)vl), "user");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "twitter_user";
    protected final String _tableDispName = "TWITTER_USER";
    protected final String _tablePropertyName = "twitterUser";
    protected final TableSqlName _tableSqlName = new TableSqlName("TWITTER_USER", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnTwitterUserId = cci("twitter_user_id", "twitter_user_id", null, null, Integer.class, "twitterUserId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnUserId = cci("user_id", "user_id", null, null, Integer.class, "userId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "user", null, null, false);
    protected final ColumnInfo _columnTwitterId = cci("twitter_id", "twitter_id", null, null, String.class, "twitterId", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnScreenName = cci("screen_name", "screen_name", null, null, String.class, "screenName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnAccessToken = cci("access_token", "access_token", null, null, String.class, "accessToken", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnTokenSecret = cci("token_secret", "token_secret", null, null, String.class, "tokenSecret", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * twitter_user_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTwitterUserId() { return _columnTwitterUserId; }
    /**
     * user_id: {UQ, NotNull, INT UNSIGNED(10), FK to user}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnUserId() { return _columnUserId; }
    /**
     * twitter_id: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTwitterId() { return _columnTwitterId; }
    /**
     * screen_name: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnScreenName() { return _columnScreenName; }
    /**
     * access_token: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnAccessToken() { return _columnAccessToken; }
    /**
     * token_secret: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnTokenSecret() { return _columnTokenSecret; }
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
        ls.add(columnTwitterUserId());
        ls.add(columnUserId());
        ls.add(columnTwitterId());
        ls.add(columnScreenName());
        ls.add(columnAccessToken());
        ls.add(columnTokenSecret());
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
    protected UniqueInfo cpui() { return hpcpui(columnTwitterUserId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnUserId()); }

    // ===================================================================================
    //                                                                       Relation Info
    //                                                                       =============
    // cannot cache because it uses related DB meta instance while booting
    // (instead, cached by super's collection)
    // -----------------------------------------------------
    //                                      Foreign Property
    //                                      ----------------
    /**
     * USER by my user_id, named 'user'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignUser() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnUserId(), DbUserDbm.getInstance().columnUserId());
        return cfi("fk_twitter_user_user", "user", this, DbUserDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "twitterUserAsOne", false);
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbTwitterUser"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbTwitterUserCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbTwitterUserBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbTwitterUser> getEntityType() { return DbTwitterUser.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbTwitterUser newEntity() { return new DbTwitterUser(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbTwitterUser)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbTwitterUser)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
