package com.kfc.fight.group.ufc.service;

import com.kfc.fight.group.ufc.dao.FighterDAO;
import com.kfc.fight.group.ufc.model.Fighter;

public class FighterService {
    FighterDAO fighterDAO = new FighterDAO();

    public void search(String name) {
        Fighter fighter = fighterDAO.findByName(name);

        if(fighter == null) {
            System.out.println("선수를 찾을 수 없습니다.");
            return;
        }

        System.out.println("=== 선수 정보 ===");
        System.out.println("이름 : " + fighter.getName() +
                "\n체급 : " + fighter.getWeightClass() + // 체급 정보 출력 추가
                "\n리치 : " + fighter.getRich() + "CM" +
                "\n키 : " + fighter.getHeight() + "CM" +
                "\n몸무게 : " +  fighter.getWeight() + "KG" +
                "\n전적 : " + fighter.getWin() + "승 " + fighter.getLose() + "패" +
                "\n타격 성공률 : " + fighter.getAttackAccuracy() + "%" +
                "\n테이크다운 방어율 : " + fighter.getTakedownAccuracy() + "%" +
                "\nKO/TKO 승리 : " + fighter.getKo_tko() + "번" +
                "\n현재 랭킹 : " + fighter.getFighter_rank());
    }
}