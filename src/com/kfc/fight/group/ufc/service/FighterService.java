package com.kfc.fight.group.ufc.service;

import com.kfc.fight.group.ufc.dao.FighterDAO;
import com.kfc.fight.group.ufc.model.Fighter;

public class FighterService {
    private FighterDAO fighterDAO = new FighterDAO();

    public void search(String name) {

        Fighter fighter = fighterDAO.findByName(name);

        if(fighter == null) {
            System.out.println("선수를 찾을 수 없습니다.");
            return;
        }

        System.out.println("=== 선수 정보 ===");
        System.out.println("이름: " + fighter.getName() +
                "\n리치: " + fighter.getRich() +
                "\n키: " + fighter.getHeight() +
                "\n몸무게: " +  fighter.getWeight() +
                "\n승 / 패" + fighter.getWin() + " / " + fighter.getLose() +
                "\n타격 성공률: " + fighter.getAttackAccuracy() +
                "\n테이크다운 방어률" + fighter.getTakedownAccuracy() +
                "\nKO_TKO" + fighter.getKo_tko() +
                "\n랭크: " + fighter.getFighter_rank());
    }
}
