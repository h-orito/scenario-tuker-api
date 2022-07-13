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
 * The DB meta of participate_rule_book. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbParticipateRuleBookDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbParticipateRuleBookDbm _instance = new DbParticipateRuleBookDbm();
    private DbParticipateRuleBookDbm() {}
    public static DbParticipateRuleBookDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbParticipateRuleBook)et).getParticipateRuleBookId(), (et, vl) -> ((DbParticipateRuleBook)et).setParticipateRuleBookId(cti(vl)), "participateRuleBookId");
        setupEpg(_epgMap, et -> ((DbParticipateRuleBook)et).getParticipateId(), (et, vl) -> ((DbParticipateRuleBook)et).setParticipateId(cti(vl)), "participateId");
        setupEpg(_epgMap, et -> ((DbParticipateRuleBook)et).getRuleBookId(), (et, vl) -> ((DbParticipateRuleBook)et).setRuleBookId(cti(vl)), "ruleBookId");
        setupEpg(_epgMap, et -> ((DbParticipateRuleBook)et).getRegisterDatetime(), (et, vl) -> ((DbParticipateRuleBook)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbParticipateRuleBook)et).getRegisterTrace(), (et, vl) -> ((DbParticipateRuleBook)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbParticipateRuleBook)et).getUpdateDatetime(), (et, vl) -> ((DbParticipateRuleBook)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbParticipateRuleBook)et).getUpdateTrace(), (et, vl) -> ((DbParticipateRuleBook)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbParticipateRuleBook)et).getParticipate(), (et, vl) -> ((DbParticipateRuleBook)et).setParticipate((OptionalEntity<DbParticipate>)vl), "participate");
        setupEfpg(_efpgMap, et -> ((DbParticipateRuleBook)et).getRuleBook(), (et, vl) -> ((DbParticipateRuleBook)et).setRuleBook((OptionalEntity<DbRuleBook>)vl), "ruleBook");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "participate_rule_book";
    protected final String _tableDispName = "PARTICIPATE_RULE_BOOK";
    protected final String _tablePropertyName = "participateRuleBook";
    protected final TableSqlName _tableSqlName = new TableSqlName("PARTICIPATE_RULE_BOOK", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnParticipateRuleBookId = cci("participate_rule_book_id", "participate_rule_book_id", null, null, Integer.class, "participateRuleBookId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParticipateId = cci("participate_id", "participate_id", null, null, Integer.class, "participateId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "participate", null, null, false);
    protected final ColumnInfo _columnRuleBookId = cci("rule_book_id", "rule_book_id", null, null, Integer.class, "ruleBookId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "ruleBook", null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * participate_rule_book_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateRuleBookId() { return _columnParticipateRuleBookId; }
    /**
     * participate_id: {UQ+, NotNull, INT UNSIGNED(10), FK to participate}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateId() { return _columnParticipateId; }
    /**
     * rule_book_id: {+UQ, IX, NotNull, INT UNSIGNED(10), FK to rule_book}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnRuleBookId() { return _columnRuleBookId; }
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
        ls.add(columnParticipateRuleBookId());
        ls.add(columnParticipateId());
        ls.add(columnRuleBookId());
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
    protected UniqueInfo cpui() { return hpcpui(columnParticipateRuleBookId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() {
        List<ColumnInfo> ls = newArrayListSized(4);
        ls.add(columnParticipateId());
        ls.add(columnRuleBookId());
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
     * PARTICIPATE by my participate_id, named 'participate'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignParticipate() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnParticipateId(), DbParticipateDbm.getInstance().columnParticipateId());
        return cfi("fk_participate_rule_book_participate", "participate", this, DbParticipateDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "participateRuleBookList", false);
    }
    /**
     * RULE_BOOK by my rule_book_id, named 'ruleBook'.
     * @return The information object of foreign property. (NotNull)
     */
    public ForeignInfo foreignRuleBook() {
        Map<ColumnInfo, ColumnInfo> mp = newLinkedHashMap(columnRuleBookId(), DbRuleBookDbm.getInstance().columnRuleBookId());
        return cfi("fk_participate_rule_book_rule_book", "ruleBook", this, DbRuleBookDbm.getInstance(), mp, 1, org.dbflute.optional.OptionalEntity.class, false, false, false, false, null, null, false, "participateRuleBookList", false);
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbParticipateRuleBook"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbParticipateRuleBookCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbParticipateRuleBookBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbParticipateRuleBook> getEntityType() { return DbParticipateRuleBook.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbParticipateRuleBook newEntity() { return new DbParticipateRuleBook(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbParticipateRuleBook)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbParticipateRuleBook)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
