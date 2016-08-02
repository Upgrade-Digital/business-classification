package digital.upgrade.businessclassification;

/**
 * The business sector
 */
public enum BusinessSector implements SectorInformation, Groups {

  SOFTWARE_SERVICES {
    public IndustryGroup[] groups = {
        IndustryGroup.SOFTWARE_SERVICES
    };

    @Override
    public IndustryGroup[] groups() {
      return groups;
    }

    @Override
    public String code() {
      return "5702";
    }

    @Override
    public String label() {
      return "Software & IT Services";
    }
  };

}
