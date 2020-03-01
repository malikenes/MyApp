package com.emk.replicamilliyet.util

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.emk.replicamilliyet.ui.DashBoardActivity


/**     Code with ❤
╔════════════════════════════╗
║  Created by Enes Malik Kaptan   ║
╠════════════════════════════╣
║ kaptanenesmalik@gmail.com ║
╠════════════════════════════╣
║     01/03/2020 - 16:07     ║
╚════════════════════════════╝
 */

infix fun <T : AppCompatActivity> AppCompatActivity.extStartActivity(className: Class<T>) {
    startActivity(Intent(this, DashBoardActivity::class.java))
}