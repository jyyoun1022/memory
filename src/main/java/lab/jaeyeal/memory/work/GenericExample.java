package lab.jaeyeal.memory.work;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class GenericExample {
//    private <T> List<T> currentDateWithoutDay(String searchYear, String searchMonth, List<T> dataList) {
//        if (searchMonth.length() > 0) {
//            DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyyMMdd");
//
//            LocalDate searchStartDate = LocalDate.of(Integer.valueOf(searchYear), Integer.valueOf(searchMonth), 1);
//            LocalDate searchEndDate = LocalDate.of(Integer.valueOf(searchYear), Integer.valueOf(searchMonth) + 1, 1).minusDays(1);
//            LocalDate now = LocalDate.now();
//            if (now.isBefore(searchEndDate)) {
//                searchEndDate = now;
//            }
//            while (searchStartDate.isBefore(searchEndDate)) {
//                boolean found = false;
//                String startDateString = searchStartDate.format(dateTimeFormat);
//                for (T item : dataList) {
//                    if (item instanceof CompanyData) {
//                        CompanyData companyData = (CompanyData) item;
//                        if (startDateString.equals(companyData.getWorkDate())) {
//                            found = true;
//                            break;
//                        }
//                    } else if (item instanceof CompanyWorkData) {
//                        CompanyWorkData companyWorkData = (CompanyWorkData) item;
//                        if (startDateString.equals(companyWorkData.getWorkDate())) {
//                            found = true;
//                            break;
//                        }
//                    } else if (item instanceof CompanyPointData) {
//                        CompanyPointData companyPointData = (CompanyPointData) item;
//                        if (startDateString.equals(companyPointData.getWorkDate())) {
//                            found = false;
//                            break;
//                        }
//                    }
//
//                }
//                if (!found) {
//                    // 여기서 T 타입에 따른 새 항목을 생성해야 합니다.
//                    // 예를 들어, CompanyData 클래스와 관련된 T 타입을 생성할 수 있습니다.
//                    if (dataList.get(0) instanceof CompanyData) {
//                        CompanyData companyData = new CompanyData();
//                        companyData.setWorkDate(startDateString);
//                        ((List<CompanyData>) dataList).add(companyData);
//                    } else if (dataList.get(0) instanceof CompanyWorkData) {
//                        CompanyWorkData companyWorkData = new CompanyWorkData();
//                        companyWorkData.setWorkDate(startDateString);
//                        ((List<CompanyWorkData>)dataList).add(companyWorkData);
//                    } else if (dataList.get(0) instanceof CompanyPointData) {
//                        CompanyPointData companyPointData = new CompanyPointData();
//                        companyPointData.setWorkDate(startDateString);
//                        ((List<CompanyPointData>)dataList).add(companyPointData);
//                    }
//                }
//                searchStartDate = searchStartDate.plusDays(1);
//            }
//        }
//        return dataList;
//    }
////        if (requestVo.getSearchDay()) {
////            currentDateWithoutDay(requestVo.getSearchYear(),requestVo.getSearchMonth(),companyDataList);
////            Collections.sort(companyDataList,Comparator.comparing((CompanyData companyData) -> companyData.getWorkDate()));
////        }
////        if (requestVo.getSearchDay()) {
////            currentDateWithoutDay(requestVo.getSearchYear(),requestVo.getSearchMonth(),dataList);
////            Collections.sort(dataList,Comparator.comparing((CompanyWorkData companyWorkData) -> companyWorkData.getWorkDate()));
////        }
//    //        if (requestVo.getSearchDay()) {
////            currentDateWithoutDay(requestVo.getSearchYear(),requestVo.getSearchMonth(),dataList);
////            Collections.sort(dataList,Comparator.comparing((CompanyPointData companyPointData) -> companyPointData.getWorkDate()));
////        }
}
