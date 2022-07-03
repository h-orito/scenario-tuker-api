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
 * The DB meta of participate_impression. (Singleton)
 * @author DBFlute(AutoGenerator)
 */
public class DbParticipateImpressionDbm extends AbstractDBMeta {

    // ===================================================================================
    //                                                                           Singleton
    //                                                                           =========
    private static final DbParticipateImpressionDbm _instance = new DbParticipateImpressionDbm();
    private DbParticipateImpressionDbm() {}
    public static DbParticipateImpressionDbm getInstance() { return _instance; }

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
        setupEpg(_epgMap, et -> ((DbParticipateImpression)et).getParticipateImpressionId(), (et, vl) -> ((DbParticipateImpression)et).setParticipateImpressionId(cti(vl)), "participateImpressionId");
        setupEpg(_epgMap, et -> ((DbParticipateImpression)et).getParticipateId(), (et, vl) -> ((DbParticipateImpression)et).setParticipateId(cti(vl)), "participateId");
        setupEpg(_epgMap, et -> ((DbParticipateImpression)et).getHasSpoiler(), (et, vl) -> ((DbParticipateImpression)et).setHasSpoiler((Boolean)vl), "hasSpoiler");
        setupEpg(_epgMap, et -> ((DbParticipateImpression)et).getDisclosureRange(), (et, vl) -> ((DbParticipateImpression)et).setDisclosureRange((String)vl), "disclosureRange");
        setupEpg(_epgMap, et -> ((DbParticipateImpression)et).getImpression(), (et, vl) -> ((DbParticipateImpression)et).setImpression((String)vl), "impression");
        setupEpg(_epgMap, et -> ((DbParticipateImpression)et).getRegisterDatetime(), (et, vl) -> ((DbParticipateImpression)et).setRegisterDatetime(ctldt(vl)), "registerDatetime");
        setupEpg(_epgMap, et -> ((DbParticipateImpression)et).getRegisterTrace(), (et, vl) -> ((DbParticipateImpression)et).setRegisterTrace((String)vl), "registerTrace");
        setupEpg(_epgMap, et -> ((DbParticipateImpression)et).getUpdateDatetime(), (et, vl) -> ((DbParticipateImpression)et).setUpdateDatetime(ctldt(vl)), "updateDatetime");
        setupEpg(_epgMap, et -> ((DbParticipateImpression)et).getUpdateTrace(), (et, vl) -> ((DbParticipateImpression)et).setUpdateTrace((String)vl), "updateTrace");
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
        setupEfpg(_efpgMap, et -> ((DbParticipateImpression)et).getParticipate(), (et, vl) -> ((DbParticipateImpression)et).setParticipate((OptionalEntity<DbParticipate>)vl), "participate");
    }
    public PropertyGateway findForeignPropertyGateway(String prop)
    { return doFindEfpg(_efpgMap, prop); }

    // ===================================================================================
    //                                                                          Table Info
    //                                                                          ==========
    protected final String _tableDbName = "participate_impression";
    protected final String _tableDispName = "PARTICIPATE_IMPRESSION";
    protected final String _tablePropertyName = "participateImpression";
    protected final TableSqlName _tableSqlName = new TableSqlName("PARTICIPATE_IMPRESSION", _tableDbName);
    { _tableSqlName.xacceptFilter(DbDBFluteConfig.getInstance().getTableSqlNameFilter()); }
    public String getTableDbName() { return _tableDbName; }
    public String getTableDispName() { return _tableDispName; }
    public String getTablePropertyName() { return _tablePropertyName; }
    public TableSqlName getTableSqlName() { return _tableSqlName; }

    // ===================================================================================
    //                                                                         Column Info
    //                                                                         ===========
    protected final ColumnInfo _columnParticipateImpressionId = cci("participate_impression_id", "participate_impression_id", null, null, Integer.class, "participateImpressionId", null, true, true, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnParticipateId = cci("participate_id", "participate_id", null, null, Integer.class, "participateId", null, false, false, true, "INT UNSIGNED", 10, 0, null, null, false, null, null, "participate", null, null, false);
    protected final ColumnInfo _columnHasSpoiler = cci("has_spoiler", "has_spoiler", null, null, Boolean.class, "hasSpoiler", null, false, false, true, "BIT", null, null, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnDisclosureRange = cci("disclosure_range", "disclosure_range", null, null, String.class, "disclosureRange", null, false, false, true, "VARCHAR", 50, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnImpression = cci("impression", "impression", null, null, String.class, "impression", null, false, false, true, "TEXT", 65535, 0, null, null, false, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterDatetime = cci("register_datetime", "register_datetime", null, null, java.time.LocalDateTime.class, "registerDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnRegisterTrace = cci("register_trace", "register_trace", null, null, String.class, "registerTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateDatetime = cci("update_datetime", "update_datetime", null, null, java.time.LocalDateTime.class, "updateDatetime", null, false, false, true, "DATETIME", 19, 0, null, null, true, null, null, null, null, null, false);
    protected final ColumnInfo _columnUpdateTrace = cci("update_trace", "update_trace", null, null, String.class, "updateTrace", null, false, false, true, "VARCHAR", 64, 0, null, null, true, null, null, null, null, null, false);

    /**
     * participate_impression_id: {PK, ID, NotNull, INT UNSIGNED(10)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateImpressionId() { return _columnParticipateImpressionId; }
    /**
     * participate_id: {UQ, NotNull, INT UNSIGNED(10), FK to participate}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnParticipateId() { return _columnParticipateId; }
    /**
     * has_spoiler: {NotNull, BIT}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnHasSpoiler() { return _columnHasSpoiler; }
    /**
     * disclosure_range: {NotNull, VARCHAR(50)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnDisclosureRange() { return _columnDisclosureRange; }
    /**
     * impression: {NotNull, TEXT(65535)}
     * @return The information object of specified column. (NotNull)
     */
    public ColumnInfo columnImpression() { return _columnImpression; }
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
        ls.add(columnParticipateImpressionId());
        ls.add(columnParticipateId());
        ls.add(columnHasSpoiler());
        ls.add(columnDisclosureRange());
        ls.add(columnImpression());
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
    protected UniqueInfo cpui() { return hpcpui(columnParticipateImpressionId()); }
    public boolean hasPrimaryKey() { return true; }
    public boolean hasCompoundPrimaryKey() { return false; }

    // -----------------------------------------------------
    //                                        Unique Element
    //                                        --------------
    public UniqueInfo uniqueOf() { return hpcui(columnParticipateId()); }

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
        return cfi("fk_participate_impression_participate", "participate", this, DbParticipateDbm.getInstance(), mp, 0, org.dbflute.optional.OptionalEntity.class, true, false, false, false, null, null, false, "participateImpressionAsOne", false);
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
    public String getEntityTypeName() { return "dev.wolfort.dbflute.exentity.DbParticipateImpression"; }
    public String getConditionBeanTypeName() { return "dev.wolfort.dbflute.cbean.DbParticipateImpressionCB"; }
    public String getBehaviorTypeName() { return "dev.wolfort.dbflute.exbhv.DbParticipateImpressionBhv"; }

    // ===================================================================================
    //                                                                         Object Type
    //                                                                         ===========
    public Class<DbParticipateImpression> getEntityType() { return DbParticipateImpression.class; }

    // ===================================================================================
    //                                                                     Object Instance
    //                                                                     ===============
    public DbParticipateImpression newEntity() { return new DbParticipateImpression(); }

    // ===================================================================================
    //                                                                   Map Communication
    //                                                                   =================
    public void acceptPrimaryKeyMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptPrimaryKeyMap((DbParticipateImpression)et, mp); }
    public void acceptAllColumnMap(Entity et, Map<String, ? extends Object> mp)
    { doAcceptAllColumnMap((DbParticipateImpression)et, mp); }
    public Map<String, Object> extractPrimaryKeyMap(Entity et) { return doExtractPrimaryKeyMap(et); }
    public Map<String, Object> extractAllColumnMap(Entity et) { return doExtractAllColumnMap(et); }
}
