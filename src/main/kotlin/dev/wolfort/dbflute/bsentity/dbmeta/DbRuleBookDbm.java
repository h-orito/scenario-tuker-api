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
 * The DB meta of rule_book. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbRuleBookDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbRuleBookDbm _instance = new DbRuleBookDbm();
    private DbRuleBookDbm() {}
    public static DbRuleBookDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbRuleBook)et).getRuleBookId(), (et, vl) -> ((DbRuleBook)et).setRuleBookId(cti(vl)), "ruleBookId");
        setupEpg(_epgMap, et -> ((DbRuleBook)et).getGameSystemId(), (et, vl) -> ((DbRuleBook)et).setGameSystemId(cti(vl)), "gameSystemId");
        setupEpg(_epgMap, et -> ((DbRuleBook)et).getRuleBookName(), (et, vl) -> ((DbRuleBook)et).setRuleBookName((String)vl), "ruleBookName");
        setupEpg(_epgMap, et -> ((DbRuleBook)et).getRuleBookType(), (et, vl) -> ((DbRuleBook)et).setRuleBookType((String)vl), "ruleBookType");
        setupEpg(_epgMap, et -> ((DbRuleBook)et).getRegisterDatetime(), (et, vl) -> ((DbRuleBook)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbRuleBook)et).getRegisterTrace(), (et, vl) -> ((DbRuleBook)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbRuleBook)et).getUpdateDatetime(), (et, vl) -> ((DbRuleBook)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbRuleBook)et).getUpdateTrace(), (et, vl) -> ((DbRuleBook)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbRuleBook)et).getGameSystem(), (et, vl) -> ((DbRuleBook)et).setGameSystem((OptionalEntity<DbGameSystem>)vl), "gameSystem");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "rule_book";
    protected final String _tableDispName = "RULE_BOOK";
    protected final String _tablePropertyName = "ruleBook";
    protected final TableSqlName _tableSqlName = new TableSqlName("RULE_BOOK", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnRuleBookId = cci("rule_book_id", "rule_book_id", null, null, Integer.class, "ruleBookId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, "participateRuleBookList,ruleBookDictionaryList,userRuleBookList", null, false);
    protected final ColumnInfo _columnGameSystemId = cci("game_system_id", "game_system_id", null, null, Integer.class, "gameSystemId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "gameSystem", null, null, false);
    protected final ColumnInfo _columnRuleBookName = cci("rule_book_name", "rule_book_name", null, null, String.class, "ruleBookName", null, false, false, true, "VARCHAR", 255, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRuleBookType = cci("rule_book_type", "rule_book_type", null, null, String.class, "ruleBookType", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRuleBookId() { return _columnRuleBookId; }
    /**
     * game_system_id: {IX, NotNull, INT UNSIGNED(10), FK to game_system}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnGameSystemId() { return _columnGameSystemId; }
    /**
     * rule_book_name: {NotNull, VARCHAR(255)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRuleBookName() { return _columnRuleBookName; }
    /**
     * rule_book_type: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRuleBookType() { return _columnRuleBookType; }
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
        ls.add(columnRuleBookId());
        ls.add(columnGameSystemId());
        ls.add(columnRuleBookName());
        ls.add(columnRuleBookType());
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
    protected UniqueInfo cpui() { return hpcpui(columnRuleBookId()); }
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
        return cfi("fk_rule_book_game_system", "gameSystem", this, DbGameSystemDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "ruleBookList", false);
    }

    // -----------------------------------------------------
    //                                     Referrer Property
    //                                     -----------------
    /**
     * PARTICIPATE_RULE_BOOK by rule_book_id, named 'participateRuleBookList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerParticipateRuleBookList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRuleBookId(), DbParticipateRuleBookDbm.getInstance().columnRuleBookId());
        return cri("fk_participate_rule_book_rule_book", "participateRuleBookList", this, DbParticipateRuleBookDbm.getInstance(), mp, false, "ruleBook");
    }
    /**
     * RULE_BOOK_DICTIONARY by rule_book_id, named 'ruleBookDictionaryList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerRuleBookDictionaryList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRuleBookId(), DbRuleBookDictionaryDbm.getInstance().columnRuleBookId());
        return cri("fk_rule_book_dictionary_rule_book", "ruleBookDictionaryList", this, DbRuleBookDictionaryDbm.getInstance(), mp, false, "ruleBook");
    }
    /**
     * USER_RULE_BOOK by rule_book_id, named 'userRuleBookList'.
     * @return The information object of referrer property. (NotNull)
     */
    public ReferrerInfo referrerUserRuleBookList() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRuleBookId(), DbUserRuleBookDbm.getInstance().columnRuleBookId());
        return cri("fk_user_rule_book_rule_book", "userRuleBookList", this, DbUserRuleBookDbm.getInstance(), mp, false, "ruleBook");
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbRuleBook"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbRuleBookCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbRuleBookBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbRuleBook> getEntityType() { return DbRuleBook.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbRuleBook newEntity() { return new DbRuleBook(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbRuleBook)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbRuleBook)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
