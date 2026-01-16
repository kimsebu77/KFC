package com.kfc.fight.group.one.service;

import com.kfc.fight.group.one.dao.RankingDAO;
import com.kfc.fight.group.one.model.Fighter;
import java.util.List;
import java.util.Scanner;

public class RankingService {
    private RankingDAO rankingDAO = new RankingDAO();
    private Scanner scan = new Scanner(System.in);

    public void showRankingMenu() {
        System.out.println("\n===== 체급별 랭킹 =====");
        System.out.println("1.아톰급 2.스트로급 3. 밴텀급 4. 페더급 5. 라이트급 6. 웰터급 7. 미들급 8. 라이트헤비급 9. 헤비급 (0. 뒤로가기)");
        System.out.print("선택: ");
        int choice = Integer.parseInt(scan.nextLine());

        String weightClass = "";
        switch (choice) {
            case 1 -> weightClass = "아톰";
            case 2 -> weightClass = "스트로";
            case 3 -> weightClass = "밴텀";
            case 4 -> weightClass = "페더";
            case 5 -> weightClass = "라이트";
            case 6 -> weightClass = "웰터";
            case 7 -> weightClass = "미들";
            case 8 -> weightClass = "라이트헤비";
            case 9 -> weightClass = "헤비";
            case 0 -> {
                return;
            }
            default -> {
                System.out.println("잘못된 선택입니다. 다시 입력해주세요.");
            }
        }

        displayRankings(weightClass);
    }

    private void displayRankings(String weightClass) {
        List<Fighter> rankings = rankingDAO.getRankingsByWeightClass(weightClass);

        System.out.println("\n--- " + weightClass + " 랭킹 현황 ---");
        System.out.println("순위 | 이름 | 전적");
        System.out.println("-------------------------");

        if (rankings.isEmpty()) {
            System.out.println("등록된 선수가 없습니다.");
        } else {
            for (Fighter f : rankings) {
                String rank = f.getFighter_rank().equals("C") ? "[CHAMP]" : "   #" + f.getFighter_rank();
                System.out.printf("%s | %s | %d승 %d패 |    (%s)\n",
                        rank, f.getName(), f.getWin(), f.getLose(), f.getStriking());
            }
        }
    }
}