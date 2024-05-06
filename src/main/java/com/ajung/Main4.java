package com.ajung;

public class Main4 {

    public int solution(String[] birthDays) {
        int answer = 0;

        for (String birth : birthDays) {
            if (validationBirthDay(birth)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean validationBirthDay(String birth) {
        if (birth.length() > 10) {
            return false;
        }
        String[] splitDate = birth.split("-");
        if (splitDate.length != 3 || splitDate[0].length() != 4) {
            return false;
        }

        int year = Integer.parseInt(splitDate[0]);
        if (splitDate[1].length() != 2 || year < 1900 || year > 2021) {
            return false;
        }

        int month = Integer.parseInt(splitDate[1]);
        if (splitDate[2].length() != 2 || month < 1 || month > 12) {
            return false;
        }

        int day = Integer.parseInt(splitDate[2]);
        switch (month) {
            case 2:
                if (validationLeapYear(year, day)) return false;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 1 || day > 30) return false;
            default:
                if (day < 1 || day > 31) return false;
        }

        return true;
    }

    /**
     * 윤년에 따른 날짜 검증
     *
     * @param year 연도
     * @param day  일자
     * @return 윤년에 따른 날짜 여부 확인
     */
    private boolean validationLeapYear(int year, int day) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return day < 1 || day > 29 ? true : false;
        }
        return day < 1 || day > 28 ? true : false;
    }
}
